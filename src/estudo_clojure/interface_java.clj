(ns estudo_clojure.interface_java
  (:gen-class))

;; Chamada de métodos
(println (.toUpperCase "Hello World"))
(println (.indexOf "Hello Wolrd", "e"))

;; Criação de novo objeto
(def str1 (new String "Hello"))
(println str1)

(def my-int (new Integer 1))
(println (+ 2 my-int))

;; Importação de comando
(import java.util.Stack)
(let [stack (Stack.)]
  (.push stack "Fist Element")
  (.push stack "Second Element")
  (println (first stack)))

(println (. Math PI))

(println (.. System getProperties (get "java.version")))