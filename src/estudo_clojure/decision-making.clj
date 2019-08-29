(ns clojure.estudo_clojure.decision-making
  (:gen-class))

;; Bloco if
(defn if_statement [value1 value2]
  (if (= value1 value2)
    (println "Values are equal")
    (println "values are not equal")))
(if_statment 10 10)
(if_statment 10 20)

;; Bloco if com do (execução de um bloco maior)
(defn if_do_statement [value1 value2]
  (if (= value1 value2)
    (do (println "Values are equal")
        (println "true"))
    (do (println "values are not equal")
        (println "false"))))
(if_do_statment 10 10)
(if_do_statment 10 20)

;; Multiplos teste em um if
(defn multiples_test_if_statement [value1 value2 value3 value4]
  (if (and (= value1 value2) (= value3 value4))
    (println "Values are equal")
    (println "Values are not equal")))
(multiples_test_if_statement 10 10 20 20)
(multiples_test_if_statement 10 10 20 30)

;; Simple switch case
(defn switch_case_statement [value]
  (case value 5
        (println "x is 5")
        10 (println "x is 10")
        (println "is is neither 5 nor 10")))
(switch_case_statement 5)
(switch_case_statement 10)
(switch_case_statement 15)

;; Condicional switch
(defn cond_statament [value]
  (cond
    (= value 5) (println "x is 5")
    (= value 10) (println "x is 10")
    :else (println "x is not definied")))
(cond_statament 5)
(cond_statament 10)
(cond_statament 15)

