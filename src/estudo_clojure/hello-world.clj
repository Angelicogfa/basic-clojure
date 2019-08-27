(ns clojure.estudo_clojure.hello-world 
  (:gen-class))
(defn hello []
  (println "Hello world")
  (println (+ 6 3)))
(hello)