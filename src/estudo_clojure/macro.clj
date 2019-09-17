(ns estudo_clojure.macros
  (:gen-class))

;; Definindo uma macro
(defmacro Simple
  ([]
   (println "Ola"))
  ([nome]
   (println "Ola" nome)))

;; Executando uma macro
(println (macroexpand (Simple)))
(println (macroexpand (Simple Jose)))