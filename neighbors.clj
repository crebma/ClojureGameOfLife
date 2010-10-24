(use 'clojure.contrib.test-is)

(defn gather-living-neighbors
 ([neighbors] (count (filter (fn[cell](= cell :alive)) neighbors)))
)

(deftest number-of-living-neighbors
 (is (= (gather-living-neighbors (list :dead :dead :alive :dead :alive :alive)) 3))
 (is (= (gather-living-neighbors (list :dead :dead)) 0))
 (is (= (gather-living-neighbors (list :alive :alive)) 2))
 (is (= (gather-living-neighbors nil) 0))
)

(run-tests)
