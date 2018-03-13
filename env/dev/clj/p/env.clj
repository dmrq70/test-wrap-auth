(ns p.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [p.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[p started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[p has shut down successfully]=-"))
   :middleware wrap-dev})
