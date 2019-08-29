(ns clojure.estudo_clojure.sets
  (:require [clojure.set :as set])
  (:gen-class))

;; Define um conjuto de valores unicos
(println (set '(1 1 2 2)))

;; Define um conjunto - conjunto ordenado
(def conjunto (sorted-set 5 6 6 8 7 4 1 2 1))
(println conjunto)

;; Define um conjunto diretamente - dessa forma não é permitido numeros repetidos
(def conjunto2 #{1 2 3 4})
(type conjunto2)

;; Obtem um elemento do conjunto pela sua chave
(println (get conjunto 2))
(println (get conjunto 3))

;; Verifica se determinado elemento existe no conjunto
(println (contains? conjunto 3))
(println (contains? conjunto 2))

;; Adiciona um novo elemento ao conjunto
(def conjunto (conj conjunto 3))

;; Remove um valor do conjunto 
(def conjunto (disj conjunto 3))

;; Mescla dois conjuntos
(println (set/union conjunto (set '(3 7 8 9 10))))

;; Retorna o primeiro elemento da diferença entre os dois conjuntos
(println (set/difference #{ 1 2 } #{ 2 3 }))

;; Retorna os dados existente nos dois conjuntos
(println (set/intersection #{ 1 2 3 } #{ 2 3 4 }))

;; Indica se o primeiro subconjunto existe no segundo
(println (set/subset? #{ 1 2 3 } #{ 1 2 3 4 5 6}))
(println (set/subset? #{1 2 3} #{1 2 4 5 6}))


;; Indica se o primeiro conjuto possui o segundo conjunto
(println (set/superset? #{ 1 2 } #{ 1 2 3 }))
(println (set/superset? #{1 2 3} #{1 2 }))
