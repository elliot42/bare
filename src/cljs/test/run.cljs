(ns test.run
  (:require [cljs.test :as t]
            test.core))

(enable-console-print!)

(defmethod cljs.test/report [:cljs.test/default :begin-test-var] [m]
  (println "BEGIN" (t/testing-vars-str m)))

(defmethod cljs.test/report [:cljs.test/default :end-test-var] [m]
  (println "END" (t/testing-vars-str m)))

(defmethod cljs.test/report  [:cljs.test/default :begin-test-ns]  [m]
  (println "\nBEGIN NS" (name (:ns m))))

(defmethod cljs.test/report  [:cljs.test/default :end-test-ns]  [m]
  (println "END NS" (name (:ns m))))

(defmethod cljs.test/report [:cljs.test/default :end-run-tests] [m]
  (println "Done testing" m))

(defmethod cljs.test/report [:cljs.test/default :summary] [m]
  (println "\nRan" (:test m) "tests containing"
           (+ (:pass m) (:fail m) (:error m)) "assertions.")
  (println (:fail m) "failures," (:error m) "errors.")
  )

(defn ^:export run []
  (t/run-tests 'test.core))
