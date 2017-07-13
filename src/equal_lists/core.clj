(ns equal-lists.core
  (:gen-class))

(defn leq [x y]
  (cond
   (and (coll? x) (coll? y)) (and
                              (leq
                               (first x)
                               (first y))
                              (leq
                               (next x)
                               (next y)))
   (not (or (coll? x) (coll? y))) (= x y)
   :else false))

(defn -main
  [x y & args]
  (println (leq (read-string x) (read-string y))))
