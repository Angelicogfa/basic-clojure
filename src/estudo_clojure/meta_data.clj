(ns estudo_clojure.meta_data
  (:gen-class))

;; Define um meta para o objeto
(def my-app (with-meta [1 2 3] {:prop "values"}))
(println my-app)

;; Visualiza o meta no objeto
(println (meta my-app))

;; Adquire um novo meta ao objeto
(def my-app (vary-meta my-app assoc :newprop "new values"))

;; Visualiza o meta no objeto
(println (meta my-app))


