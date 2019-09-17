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

