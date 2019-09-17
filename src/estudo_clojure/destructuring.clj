(ns clojure.estudo_clojure.destructuring
  (:gen-class))

;; Desconstroi um objeto em itens
(defn descontruct []
  (def my-vector (vector 1 2 3 4))
  (let [[a b c d] my-vector]
    (println a b c d)))
(descontruct)

