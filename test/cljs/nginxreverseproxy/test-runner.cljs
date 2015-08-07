(ns nginxreverseproxy.test-runner
  (:require
   [cljs.test :refer-macros [run-tests]]
   [nginxreverseproxy.core-test]))

(enable-console-print!)

(defn runner []
  (if (cljs.test/successful?
       (run-tests
        'nginxreverseproxy.core-test))
    0
    1))
