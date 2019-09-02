(ns clojure.estudo_clojure.exception-handlers
  (:gen-class))

;; Manipulando excessão  de acesso à index invalido
(defn invalid_acess_index []
  (try
    (aget (int-array [1 2 3]) 5)
    (catch Exception e (println (str "caugth exception: " (.toString e))))
    (finally (println "this is our final block")))
  (println "Let's move on"))

(invalid_acess_index)

;; Multiplos blocos captura
(defn multiples_catchs []
  (try
    (def string1 (slurp "Exemplo1.txt"))
    (println string1)
    (catch java.io.FileNotFoundException e (println (str "caught file exception: " (.getMessage e))))
    (catch Exception e (println (str "cauth exception: " (.getMessage e))))
    (finally (println "this is our final block")))
  (println "Let's move on")) 

(multiples_catchs)