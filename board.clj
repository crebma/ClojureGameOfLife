(use 'clojure.contrib.test-is)

(defn make-board
  ([size]
    '('(:dead))
  )
)

(deftest make-board-only-includes-possible-neighbors
 (is (= (make-board 1) '('(:dead))))
 (is (= (make-board 2) '('(:dead :dead :dead)'(:dead :dead :dead)'(:dead :dead :dead)'(:dead :dead :dead))))
)

(run-tests)
