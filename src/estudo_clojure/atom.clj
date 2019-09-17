(ns estudo_clojure.atom
    (:gen-class))

(def my_atom (atom 1))

(println @my_atom)

(reset! my_atom 2)

(println @my_atom)


(compare-and-set! my_atom 0 3)

(println @my_atom)

(compare-and-set! my_atom 2 3)

(println @my_atom)

(swap! my_atom inc)

(println @my_atom)

