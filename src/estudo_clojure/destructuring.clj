<<<<<<< HEAD
(ns clojure.estudo_clojure.destructuring
  (:gen-class))

;; Desconstroi um objeto em itens
(defn descontruct []
  (def my-vector (vector 1 2 3 4))
  (let [[a b c d] my-vector]
    (println a b c d)))
(descontruct)
=======
(ns estudo_clojure.destructuring
    (:gen-class))

(defn vector_destruct []
    (def my_vector [1 2 3 4 5])
    (let [[a b c d] my_vector]
        (println a b c d)))

(vector_destruct)

(defn vector_the_rest []
    (def my_vector [1 2 3 4])
    (let [[a b & the-rest] my_vector]
        (println a b the-rest)))
(vector_the_rest))

(defn map_destruct []
    (def map {"a" 1 "b" 2})
    (let [{a "a" b "b"} map]
        (println a b)))
(map_destruct)
>>>>>>> 119e6219cfcb5d2ebf0021510269f169d1c704d8

