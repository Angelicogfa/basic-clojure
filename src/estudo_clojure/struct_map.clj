(ns estudo_clojure.meta_data.struct_map
  (:gen-class))

;; Define um tipo
(defstruct Employee :Name :Id)

;; Cria um objeto com o tipo de acordo com a sequencia de chaves do objeto
(def emp (struct Employee "Guilherme" 1))
(println emp)

;; Cria um objeto assinando os valores para as respectivas chaves
(def emp (struct-map Employee :Name "Jose" :Id 2))
(println emp)

;; Acessando uma chave do objeto
(println (:Name emp))
(println (:Id emp))

;; Alteração de um campo não é permitido devido a imutabilidade
(assoc emp :Name "Pedro")
(println emp)

;; Para alterar, será necessário reatribuir
(def emp (assoc emp :Name "Pedro"))
(println emp)

;; Incluir uma nova chave
(def emp (assoc emp :Idade 28))
(println emp)
