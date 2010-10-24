(use 'clojure.contrib.test-is)

(defn cell-with-neighbors
 ([state neighborCount]
   (if (= neighborCount 3) :alive
     (if (and (= state :alive)(= neighborCount 2)) :alive
       :dead)
   )
  )
)

(deftest live-cells-that-stay-alive
 (is (= (cell-with-neighbors :alive 2) :alive))
 (is (= (cell-with-neighbors :alive 3) :alive)))

(deftest dead-cells-that-become-alive
 (is (= (cell-with-neighbors :dead 3) :alive)))

(deftest dead-cells-that-stay-dead
 (is (= (cell-with-neighbors :dead 1) :dead)))

(deftest live-cells-that-die
 (is (= (cell-with-neighbors :alive 1) :dead))
 (is (= (cell-with-neighbors :alive 4) :dead))
 (is (= (cell-with-neighbors :alive 5) :dead))
 (is (= (cell-with-neighbors :alive 6) :dead))
 (is (= (cell-with-neighbors :alive 7) :dead))
 (is (= (cell-with-neighbors :alive 8) :dead)))

(run-tests)
