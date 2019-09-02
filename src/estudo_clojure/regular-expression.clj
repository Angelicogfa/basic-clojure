(ns clojure.estudo_clojure.regular-expression
  (:gen-class))

;; Definindo um pattern para pesquisa com regex
(def pat (re-pattern "\\d+"))

;; Busca um padrao em um texto
(println (re-find pat "abc123de"))

;; Replace string
(println (clojure.string/replace "abc123de" pat "789"))

;; Replace substring
(println (clojure.string/replace-first "abc123def123" pat "789"))