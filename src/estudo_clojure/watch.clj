(ns estudo_clojure.watch
  (:gen-class))

;; Declaração de uma variavel atom
(def x (atom 0))

;; definindo um watch para observar mudanças na variavel
(add-watch x :watcher
           (fn [key atom old-state new-state]
             (println "O valor do atom foi alterado")
             (println "Chave " key)
             (println "Atom " @atom)
             (println "Valor antigo " old-state)
             (println "Novo valor " new-state)))

(reset! x 2)

;; Remover o watch de uma variavel
(remove-watch x :watcher)
(reset! x 4)