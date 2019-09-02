(ns clojure.estudo_clojure.function_description
  (:gen-class))

;; Definicão de método
(defn function_definition []
  (println "Metodo"))
(function_definition)

;; Função anonima
(defn function_anonymous [value]
  ((fn [x] (* 2 x)) value))

(function_anonymous 5)

;; Função com parametros
(defn function_parameters [] (* 2 2))
(demo)

(defn function_parameters [x] (* 2 x))
(demo 3)

(defn function_parameters [x y] (* 2 x y))
(demo 3 8)

;; Função Variadic *
(defn function_variadic [message & others]
  (str message (clojure.string/join " " others)))

(function_variadic "Olá")
(function_variadic "Ola" " esta" "é" "uma" "mensagem")

;; Funcões de alta ordem
(filter even? (range 0 10))

