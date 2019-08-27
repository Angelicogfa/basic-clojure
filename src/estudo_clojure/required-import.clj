(ns clojure.estudo_clojure.required-import
  (:gen-class))
(require clojure.java.io)
(defn Exemple []
  (.exists(file "arquivo.txt")))
(Exemple)