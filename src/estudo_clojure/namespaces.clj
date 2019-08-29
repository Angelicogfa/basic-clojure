(ns clojure.estudo_clojure.namespaces
  (:require [clojure.set :as set])
  (:gen-class))

;; Obtendo o nome do namespace corrente
(println *ns*)

;; Gerando um alias para um namespace
(alias "string" clojure.estudo_clojure.namespaces)

;; Define um alias para um namespace
(alias 'custom-hash' 'clojure.estudo_clojure.hashmaps)

;; Lista todos os namespaces
(println (all-ns))

;; Busca um namespace
(println (find-ns 'clojure.string))

;; Retorna o nome de um particular namespace
(println (ns-name 'clojure.string))

;; Retorna o alias que esta associado a um namespace
(println (ns-aliases 'clojure.core))

;; Retorna o mapeamento de todos os namespaces mapeados
(println (count (ns-map 'clojure.core)))

;; Remove o alias de um namespace
(alias 'string 'clojure.core)
(ns-unalias 'clojure.core 'string)