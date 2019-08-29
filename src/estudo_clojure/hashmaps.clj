(ns clojure.estudo_clojure.hashmaps
  (:require [clojure.set :as set])
  (:gen-class))

;; Existem dois diferentes tipos de maps: HashMaps e SortedMaps.
;; Hashmaps: chave e valor. O campo chave deve implementar hashcode e equals
;; Sortedmaps: chave e valor. O campo chave deve implementar IComparable, ou uma instancia de Comparator.

;; Criando um hashmap
(def demo-hash (hash-map "z" "1" "b" "2" "a" "3"))
(println demo-hash)

;; Criando um sortedmap
(def demo-sort (sorted-map "z" "9" "b" "8" "a" "7" "c" "6"))
(println demo-sort)

;; Busca um elemento pelo indice
(println (get demo-hash "z"))
(println (get demo-sort "z"))

;; Verifica se o elemento existe
(println (contains? demo-hash "z"))
(println (contains? demo-hash "x"))

;; Busca a chave-valor para uma key ou nil
(println (find demo-hash "z"))
(println (find demo-hash "x"))

;; Retorna todas as chaves existentes
(println (keys demo-sort))
(println (keys demo-hash))

;; Retorna todos os valores existentes
(println (vals demo-hash))
(println (vals demo-sort))

;; Remove um elemento do map e retorna um novo mapeamento
(println (dissoc demo-hash "z"))

;; Mescla os (n) maps em um novo, se o map mais a direita possuir a mesma chave com relação ao da esquerda, o da esquerda é sobreposto
(println (merge demo-hash demo-sort))
(println (merge (hash-map "a" "1" "b" "2") (hash-map "a" "3" "c" "0") (hash-map "a" "5" "b" "7" "d" "0")))

;; Mescla os (n) maps em um novo, se o map mais a direta possuir a mesma chave com relação ao da esquerda, essa chave terá os seus valores modificados
;; de acordo com a função que for informada
(println (merge-with str demo-hash demo-sort))
(println (merge-with + (hash-map "a" 1 "b" 2) (hash-map "a" 3 "c" 0) (hash-map "a" 5 "b" 7 "d" 0)))

;; Seleciona apenas as chaves de uma map
(println (select-keys demo-hash ["z" "a"]))

;; Renomeia as chaves de um set
(println (set/rename-keys demo-hash { "z" "newz" "b" "newb" }))

;; Inverte os valores pelas chaves
(println (set/map-invert demo-hash))