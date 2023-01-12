(ns leiningen.see-plugin)

(defn see-plugin
  "I don't do a lot."
  [project & args]
  (condp = (first args)
    "morning" (leiningen.core.main/info "Good Morning!")
    "evening" (leiningen.core.main/info "Good Evening!")
    (leiningen.core.main/info "Hello World!")))
