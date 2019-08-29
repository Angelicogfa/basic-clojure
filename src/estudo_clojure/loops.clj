(ns clojure.estudo_clojure.loops
  (:gen-class))


;; Este bloco executa um while  
(defn while_statement [i]
  (def x (atom 1))
  (while (< @x i)
    (do
      (println "Iterando " @x "vezes")
      (swap! x inc))))

(while_statement 20)

;; Este bloco executa o foreach
(defn doseq_statement [array]
  (doseq [n array]
    (println n)))
(doseq_statement [10 2 30 5 79 6])

;; Este bloco executa o for i
(defn for_statement [i]
  (dotimes [n i]
    (println "Execução " n)))
(for_statement 5)

;; Este bloco executa um loop com um bloco when alinhado (condicional)
(defn loop_if_statement [i]
  (loop [x i]
    (when (> x 1)
      (println x)
      (recur (- x 2)))))
(loop_if_statement 10)