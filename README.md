# bem-classnames

A small clojure library to generate [BEM](http://getbem.com/) classnames à la some [react libraries](https://github.com/pocotan001/bem-classnames)

[![Clojars Project](https://img.shields.io/clojars/v/bem-classnames.svg)](https://clojars.org/bem-classnames)

## Usage

```clojure
(:require [bem-classnames.core :as bem])

(def b (bem/block "block")) ;; "block"
(def be (bem/block "block" "element")) ;; "block__element"
(def bem (bem/block "block" "element" {:modifier true
                                   :not-me false})) ;; "block__element--modifier"
                                
;; via partial application
(def b (bem/block "block")) ;; Function
(def be (b "element" {})) ;; "block__element"
```

## License

[MIT](./LICENSE)
