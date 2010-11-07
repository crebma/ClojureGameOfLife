(use 'clojure.contrib.test-is)

(defn make-neighbors
  ([size]
    (for [neighbors (range size)] :dead)
  )
)

(defn make-board
  ([size]
    (for [cells (range (* size size))] (make-neighbors size))
  )
)

(deftest make-board-only-includes-possible-neighbors
 (is (= (make-board 1) (list (list :dead))))
 (is (= (make-board 2) (list (list :dead :dead) (list :dead :dead) (list :dead :dead) (list :dead :dead))))
)

(run-tests)
