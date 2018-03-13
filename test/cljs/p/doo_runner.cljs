(ns p.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [p.core-test]))

(doo-tests 'p.core-test)

