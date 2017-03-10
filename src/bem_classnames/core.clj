(ns bem-classnames.core
  (:require [clojure.string :as s]))

(defn- bem
  [block
   element
   modifiers]
  (cond
    (nil? element) block
    (empty? modifiers) (str block "__" element)
    :else (s/join " " (map
                        #(str block "__" element "--" (name %))
                        (keys (filter (comp true? last) modifiers))))))

(defn block
  ([block] (partial bem block))
  ([block element] (partial bem block element))
  ([block element modifiers] (bem block element modifiers)))

(defn -main
  [& args])
