(ns estudo_clojure.date
    (:gen-class))

;; Declaração de um objeto date
(def date (java.util.Date.))

;; to string
(println (.toString date))

;; Format
(println (.format (java.text.SimpleDateFormat. "dd/MM/yyyy") date))

;; getTime
(.getTime date)