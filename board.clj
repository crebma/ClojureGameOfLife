(use 'clojure.contrib.test-is)

(deftest make-board-only-includes-possible-neighbors
 (is (= (make-board 3 3) [
     [:dead :dead :dead]
     [:dead :dead :dead :dead :dead]
     [:dead :dead :dead]
     [:dead :dead :dead :dead :dead]
     [:dead :dead :dead :dead :dead :dead :dead :dead :dead]
     [:dead :dead :dead :dead :dead]
     [:dead :dead :dead]
     [:dead :dead :dead :dead :dead]
     [:dead :dead :dead]
     ]))
)

(run-tests)
