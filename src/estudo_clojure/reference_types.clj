(ns estudo_clojure.reference_types
  (:gen-class))

;; Criando uma variavel de referencia, podendo passar uma função de validação
(def my-ref (ref 1 :validator pos?))
(println @my-ref)

;; Definindo um novo valor
(dosync (ref-set my-ref 2))
(println @my-ref)


;; Função para sincronizar o dado de forma segura (executa a transação da alteração em outra thread)
(def names (ref []))

(defn change [newname]
  (dosync (alter names conj newname)))
(change "John")
(change "Mark")
(println @names)

;; Função para alterar o valor de um dado com base em uma função
(def counter (ref 0))
(defn change2 [counter]
  (dosync (commute counter inc)))

(change2 counter)
(println @counter)
(change2 counter)
(println @counter)