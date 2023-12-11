
## Scope Function:

Kotlin cung cấp nhiều function như một block code trên 1 project. Các function này được gọi là scope function,
vì chúng tạo ra một scope tạm thời để thực hiện blog code.

Các scope function này là: `let`, `apply`, `with`, `also`, `run`, `takeIf`, `takeUnless`


| Function | Object reference | Return value   | is extention function |
|----------|------------------|----------------|-----------------------|
| let      | it               | lambda result  | yes                   |
| run      | this             | lambda result  | yes                   |
| with     | this             | lambda result  | no                    |
| apply    | this             | context object | yes                   |
| also     | it               | context object | yes                   |


- Executing a lambda on non-nullable objects: `let`
- Introducing an expression as a variable in local scope: `let`
- Object configuration: `apply`
- Object configuration and computing the result: `run`
- Running statements where an expression is required: `non-extension run`
- Additional effects: `also`
- Grouping function calls on an object: `with`


## Note Scope Function Kotlin:

| return             | [it]()   | [this]()  |
|--------------------|----------|-----------|
| [lambda result]()  | `also`   | `apply`   |
| [context object]() | `let`    | `run`     |






