(ns clojure.estudo_clojure.operators
  (:gen-class))

(defn arithmetic_operator []
  (println (+ 10 20))
  (println (- 50 25))
  (println (* 5 10))
  (println (/ 50 5))
  (println (inc 5))
  (println (dec 5))
  (println (max 1 2 3))
  (println (min 1 2 3))
  (println (rem 3 2)))

(arithmetic_operator)

(defn relational_operator []
  (println "Igualdade" (= 2 2))
  (println "Não Igualdade" (not= 2 3))
  (println "Menor" (< 2 3))
  (println "Maior" (> 5 3))
  (println "Menor Igual" (<= 2 2))
  (println "Maior Igual" (>= 5 5)))

(relational_operator)

(defn logical_operator []
  (println "And" (and true true))
  (println "or" (or true false))
  (println "not" (not false)))

(logical_operator)

(defn bitwise_operator []
  (println "bit-and" (bit-and 1 1))
  (println "bit-or" (bit-or 1 0))
  (println "bit-xor" (bit-xor 1 0))
  (println "bit-not" (bit-not 1)))

(bitwise_operator)