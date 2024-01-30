LLD of Logging system based on chain of responsibility pattern.

Advance Logging System Design

Requirements-
1. Should be able to log at multiple places - console, file.
2. Should be able to log mutiple category of messages - Info, error, debug.

Components
Application -> Logger class -> Category(Info, error, debug) 
                            -> Sink (console, file)

Design patterns-
1. for logger class -> Singleton design pattern
2. Category -> change of responsibility pattern
3. Sink -> observer design pattern

https://www.youtube.com/watch?v=RljSBrZeJ3w&t=32s
