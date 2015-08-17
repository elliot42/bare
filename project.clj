(defproject bare "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.48"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]]
  :source-paths ["src/clj" "src/cljs"]

  :cljsbuild
  {:builds
   [{:id "test"
     :source-paths ["src/cljs"]
     :compiler
     {:output-to "target/test.js"
      :optimizations :whitespace}}]
   :test-commands
   {"test" ["phantomjs" "test/setup.js" "test/context.html"]}}
  :plugins [[lein-cljsbuild "1.0.6"]])
