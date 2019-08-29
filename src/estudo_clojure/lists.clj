(ns clojure.estudo_clojure.lists
  (:gen-class))

;; Definindo uma lista - Listas implementam a interface ISeq
(defn define_list []
  (println (list 1 2 3 4 5)))

(define_list)

;; Definindo uma lista
(defn define_list []
  (println (list 'a 'b 'c 'd)))

(define_list)

;; Cria uma nova lista com base em uma lista existente
;; adicionando o novo elemento no inicio
(defn define_new_list [array new]
  (println (list* new array)))

(define_new_list [2 3 4] 1)

(def _list (list 1 2 3 4 5))

;; Busca o primeiro elemento
(println (first _list))

;; Busca o elemento de acordo com o index
(println (nth _list 0))
(println (nth _list 4))

;; Ocorre erro ao buscar um index que não existe em uma lista
(println (nth _list 6))

;; Gera uma nova lista com base em um valor adicionado no inicio de uma lista existente
(println (cons 0 _list))

;; Gera uma nova lista com base em varios valores adicionado no inicio de uma lista existente
(println (conj _list 0 -1))

;; Retorna os itens após a remoção do primeiro item
(println (rest _list))
(println (pop _list))