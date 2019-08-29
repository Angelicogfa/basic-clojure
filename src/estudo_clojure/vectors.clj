(ns clojure.estudo_clojure.vectors
  (:gen-class)
  (:require [clojure.set :as set]))

;; Cria um vetor - Coleção  de valores indixados por valores inteiros continuos
(println (vector 1 2 3 4 5 6 7 8 9))

;; Cria um vetor com base em t - :int :long :float :double :byte :short :char :boolean
(println (vector-of :int 1 2 3))
(println (vector-of :double 1.5 2.5 2.3))

(def _vetor (vector 'a 'b 'c 'd 'e))
(println _vetor)
(type _vetor)

;; Obtem um valor pela posicao do vetor
(println (nth _vetor 0))
(println (nth _vetor 1))

;; Obtem o elemento do index
(println (get _vetor 0))

;; Adiciona um novo elemento ao vetor
(println (conj _vetor 1))

;; Remove o ultimo elemento do vetor e devolve a nova matriz
(println (pop _vetor))

;; Returna uma nova matriz a partir de um ponto inicial e final da matriz informada
(println (subvec _vetor 2))
(println (subvec _vetor 2 3))

