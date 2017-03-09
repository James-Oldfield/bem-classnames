(ns bem-classnames.core-test
  (:require [clojure.test :refer :all]
            [bem-classnames.core :refer :all]))

(def b (block "block"))
(def be (block "block" "element"))

(deftest test-block
  (testing "BEM function"
    (is (= "block__element--modifier" (block
                                        "block"
                                        "element"
                                        {:modifier true
                                         :random false})))
    (is (= "block" (b nil {})))
    (is (= "block__element" (b "element" {})))
    (is (= "block__element" (be {})))
    (is (= "block__element--modifier" (be {:modifier true})))))
