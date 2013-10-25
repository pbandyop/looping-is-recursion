(ns looping-is-recursion)

(defn pow
   ([base exp] (pow base exp base)) ; default the accumulator argument to the base of the power
   ([base exp acc]
    (cond
     (= exp 1)  acc ; base case - return the accumulated power
      (= exp 0) 1
       :else (recur base (dec exp) (* base acc))
      )))

(defn power [base exp] (pow base exp))


(defn last-element [a-seq]
  (let [help (fn [z]
               (if (empty? (rest z))
                (first z)
                 (recur (rest z))
               ))]
    (help a-seq))
  )


(defn seq= [seq1 seq2]
  (cond
       (= seq1 seq2) true
       :else false)
      )

(defn indices [pred coll]
   (keep-indexed #(when (pred %2) %1) coll))
(defn find-first-index [pred a-seq]
  (first (indices true?
                  (vec (map pred a-seq)))))


  (defn pum [x]
  (loop  [acc 0
          y  x]
               (if (empty? y)
                 acc
                 (recur (+ (first y) acc)  (rest y)))))
(defn avg [a-seq] (/ (pum a-seq) (count a-seq)))


(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]

  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

