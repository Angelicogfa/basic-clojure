(ns clojure.estudo_clojure.predicates
  (:gen-class))

;; Predicates são funções que retornam um indicador true ou false com base em uma condição
;; a fim de avaliar determinada sentença

;; Valida se todos os numeros de uma lista são pares com base em um pipeline de predicates
(println ((every-pred number? even?) 2 4 6))
(println ((every-pred number? even?) 2 4 3))

;; Valida se todos são de determinada condição
(println (every? odd? (list 2 4 6)))
(println (every? even? (list 2 4 6)))

;; Valida se ao menos um item satisfaz a condição
(println (some odd? '(1 2 4 6 5)))

;; Valida se todos os itens satisfazem uma condição, validando com uma negação
(print (not-any? even? '(2 4 6)))