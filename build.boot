(set-env!
  :source-paths #{"src"}
  :dependencies '[[adzerk/bootlaces    "0.1.5"       :scope "test"]])

(require '[adzerk.bootlaces :refer :all])

(def +version+ "0.1.0-SNAPSHOT")

(bootlaces! +version+)

(task-options!
  pom {:project 'deraen/boot-cryogen
       :version +version+
       :description "Boot task for Cryogen static site generator"
       :url "https://github.com/deraen/boot-cryogen"
       :scm {:url "https://github.com/deraen/boot-cryogen"}
       :license {:name "Eclipse Public License"
                 :url  "http://www.eclipse.org/legal/epl-v10.html"}})
