(ns p.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[p started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[p has shut down successfully]=-"))
   :middleware identity})
