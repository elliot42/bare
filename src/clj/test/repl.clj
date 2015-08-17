(ns test.repl
  (:require [cljs.repl :as repl]
            [cljs.repl.node :as node]
            [cljs.build.api :as build]))

(defn repl []
  (repl/repl* (node/repl-env) {}))
