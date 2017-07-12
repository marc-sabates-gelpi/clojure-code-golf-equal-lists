(ns equal-lists.core
  (:gen-class))

(defn leq [x y]
  (cond
   (and (coll? x) (coll? y)) (and (leq (first x) (first y)) (leq (next x) (next y)))
   (and (not (coll? x)) (not (coll? y))) (= x y)
   :else false))

(defn -main
  [x y & args]
  (leq x y))
