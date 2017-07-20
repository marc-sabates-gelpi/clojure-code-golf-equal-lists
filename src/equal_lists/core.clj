(ns equal-lists.core
  (:gen-class))

(defmulti leq (fn [x y]
                (cond
                 (and (coll? x) (coll? y)) :all-colls
                 (not (or (coll? x) (coll? y))) :none-colls
                 :else :mixed-colls)))

(defmethod leq :all-colls
  [x y]
  (and
   (leq
    (first x)
    (first y))
   (leq
    (next x)
    (next y))))

(defmethod leq :none-colls
  [x y]
  (= x y))

(defmethod leq :mixed-colls
  [_ _]
  false)

(defn -main
  [x y & args]
  (println (leq (read-string x) (read-string y))))
