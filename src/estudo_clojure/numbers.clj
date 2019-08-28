(ns clojure.estudo_clojure.numbers)

;; Numbers types
(defn numbers_types []
  (def x 5)
  (def y 5.1)
  (println (type x))
  (println (type y)))
(numbers_types)

;; Valida se o numéro é zero
(defn validate_number_zero [array]
  (doseq [x array]
    (if (zero? x)
      (println x " is zero")
      (println x " not is zero"))))
(validate_number_zero [10 0 0.5])

(filter zero? [0 0.5 1])

;; Valida se o número é positivo
(defn validate_number_pos [array]
  (doseq [x array]
    (if (pos? x)
      (println x " is positive")
      (println x " is negative"))))
(validate_number_pos [-1 0 1])

(filter pos? [-1 0 1])

;; Valida se o número é negativo
(defn validate_number_neg [array]
  (doseq [x array]
    (if (neg? x)
      (println x " is nevative")
      (println x " is positive"))))
(validate_number_pos [-1 0 1])

(filter neg? [-1 0 1])

;; Valida se o numero é par
(defn validate_number_even [array]
  (doseq [x array]
    (if (even? x)
      (println x " is even")
      (println x " is odd"))))
(validate_number_even [0 1 2 3 4 5 6 7 8 9])

(filter even? (range 0 10))

;; valida se o número é impar
(defn validate_number_odd [array]
  (doseq [x array]
    (if (odd? x)
      (println x " is odd")
      (println x " is even"))))
(validate_number_odd [0 1 2 3 4 5 6 7 8 9])

(filter odd? (range 0 10))

;; Valida se é um número
(defn validate_is_muber [value]
  (if (number? value)
    (println  value " is number")
    (println value " is not number")))

(validate_is_muber "Olá")
(validate_is_muber 10)
(validate_is_muber 10.5)

;; Valida se é um integer
(defn validate_is_integer [array]
  (doseq [x array]
    (if (integer? x)
      (println x " is integer")
      (println x " not is integer"))))
(validate_is_integer [0.0 1 1.6 2])

(filter integer? [0.0 1 1.6 2])

;; Valida se é um float
(defn validate_is_float [array]
  (doseq [x array]
    (if (float? x)
      (println x " is float")
      (println x " not is float"))))
(validate_is_float [0.0 1 1.5 2])

(filter float? [0.0 1 1.5 2])