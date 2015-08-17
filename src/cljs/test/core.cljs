(ns test.core
  (:require [cljs.test :as t :refer-macros [deftest is testing async]]
            [cljs.core.async :as async])
  (:require-macros [cljs.core.async.macros :refer [go]]))

(deftest test-sync
  (is true))

(deftest test-async
  (async done
    (go (is true)
        (done))))
