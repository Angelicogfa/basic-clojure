(ns clojure.estudo_clojure.sequences
  (:gen-class))

(def sequencia (seq [1 2 3]))

;; Criando uma sequencia
(println sequencia)

;; Adiciona um novo item no inicio da sequencia
(println (cons 0 [1 2 3]))

;; Adiciona um novo item no final da sequencia
(println (conj (reverse sequencia) 4))

;; concatena duas sequencias
(println (concat sequencia (seq [4 5 6 7])))

;; Diferenca entre sequencias
(println (distinct (seq [1 1 2 3 3 4 5])))

;; Inverte a sequencia
(println (reverse sequencia))

;; Primeiro elemento da sequencia
(println (first sequencia))

;; Ultimo elemento da sequencia
(println (last sequencia))

;; Remove o primeiro item da sequencia
(println (rest sequencia))

;; Ordena a sequencia
(println (sort (set [5 3 4 8 1 4])))

;; Remove os itens da sequencia com base na quantidade de itens a ser removidos
(println (drop 2 sequencia))

;; Obtem os ultimos x numeros
(println (take-last 2 sequencia))

;; Obtem os primeiros x numeros
(println (take 3 (seq [2 3 4 5 6 7 8 9])))

;; Quebra a sequencia em duas partes com base no indice
(println (split-at 3 (seq [2 3 4 5 6 8 7 9 4 2])))