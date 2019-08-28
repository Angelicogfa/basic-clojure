(ns clojure.estudo_clojure.recursividade)

;; Função fibonnaci
(defn fib [n]
  "Gera um valor da sequencia fibonnaci de acordo com o indice"
  (println n)
  (if (<= n 1)
    n
    (+ (fib (- n 1)) (fib (- n 2)))))

(fib 7)
(map fib (range 0 10))

;; Função com carregamento do i de acordo com o incremento maximo 
(defn print_value [value]
  (loop [i 0]
    (when (< i value))
    (println i)
    (recur (inc i))))
(print_value 5)
