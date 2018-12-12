(ns user-groups.core
  (:gen-class)
  (:require [clojure.java.shell :as shell])
  (:require [clojure.string :as str]))

(defn user-groups
  "For the user identified by name, run the 'id' command to list groups the user is a member of.
  Put each group on its own line so the result can be piped into grep."
  [name]
  (str/replace (first (rest (str/split (:out (shell/sh "id" name)) #"groups="))) #"," "\n"))

(defn -main [name]
  (do
   (println (user-groups name))
   (System/exit 0)))
