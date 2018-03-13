(ns user
  (:require [mount.core :as mount]
            [p.figwheel :refer [start-fw stop-fw cljs]]
            p.core))

(defn start []
  (mount/start-without #'p.core/repl-server))

(defn stop []
  (mount/stop-except #'p.core/repl-server))

(defn restart []
  (stop)
  (start))


