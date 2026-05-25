# 🧵 Java Thread Class — Function Reference

This document provides a concise reference for commonly used methods in the `java.lang.Thread` class.

It includes only **function names** and **their purposes**, making it useful as a quick guide for Java multithreading.

---

## ✅ Thread Creation & Execution

| Function | Description |
|----------|-------------|
| `Thread()` | Creates a new thread object |
| `Thread(Runnable target)` | Creates a thread with a runnable task |
| `Thread(String name)` | Creates a thread with a name |
| `Thread(Runnable target, String name)` | Creates a thread with task and name |
| `start()` | Starts a new thread and invokes `run()` |
| `run()` | Contains the code executed by the thread |

---

## ✅ Thread Control & Scheduling

| Function | Description |
|----------|-------------|
| `sleep(long millis)` | Pauses current thread for given time |
| `sleep(long millis, int nanos)` | Pauses thread with nanosecond precision |
| `yield()` | Suggests scheduler to switch execution |
| `join()` | Waits for a thread to finish execution |
| `join(long millis)` | Waits for thread with timeout |
| `join(long millis, int nanos)` | Timed wait with nanoseconds |

---

## ✅ Thread Information

| Function | Description |
|----------|-------------|
| `currentThread()` | Returns currently executing thread |
| `getId()` | Returns thread unique ID |
| `getName()` | Gets thread name |
| `setName(String)` | Sets thread name |
| `getState()` | Returns current thread state |
| `isAlive()` | Checks if thread is still running |

---

## ✅ Thread Priority

| Function | Description |
|----------|-------------|
| `setPriority(int)` | Sets thread priority |
| `getPriority()` | Returns thread priority |

### Priority Constants
- `Thread.MIN_PRIORITY`
- `Thread.NORM_PRIORITY`
- `Thread.MAX_PRIORITY`

---

## ✅ Daemon Threads

| Function | Description |
|----------|-------------|
| `setDaemon(boolean)` | Marks thread as daemon |
| `isDaemon()` | Checks if thread is daemon |

---

## ✅ Interrupt Handling

| Function | Description |
|----------|-------------|
| `interrupt()` | Sends interrupt signal to thread |
| `isInterrupted()` | Checks interrupt status |
| `interrupted()` | Checks and clears interrupt flag |

---

## ✅ Debugging & Stack Utilities

| Function | Description |
|----------|-------------|
| `getStackTrace()` | Returns stack trace of thread |
| `getAllStackTraces()` | Returns stack traces of all threads |
| `dumpStack()` | Prints current stack trace |

---

## ✅ Thread Groups

| Function | Description |
|----------|-------------|
| `getThreadGroup()` | Returns thread group |
| `activeCount()` | Returns active threads count |

---

## ✅ ClassLoader Methods (Advanced)

| Function | Description |
|----------|-------------|
| `getContextClassLoader()` | Gets thread context class loader |
| `setContextClassLoader(ClassLoader)` | Sets thread context class loader |

---

## ✅ Exception Handling

| Function | Description |
|----------|-------------|
| `setUncaughtExceptionHandler()` | Sets handler for uncaught exceptions |
| `getUncaughtExceptionHandler()` | Gets exception handler |
| `setDefaultUncaughtExceptionHandler()` | Sets global exception handler |

---

## ✅ Synchronization Utility

| Function | Description |
|----------|-------------|
| `holdsLock(Object obj)` | Checks if current thread holds object's monitor lock |

---

## ❌ Deprecated Methods (Do Not Use)

| Function | Description |
|----------|-------------|
| `stop()` | Forcefully stops thread (unsafe) |
| `suspend()` | Suspends thread (deadlock risk) |
| `resume()` | Resumes suspended thread |
| `destroy()` | Never implemented |
| `countStackFrames()` | Deprecated stack method |

---

## ✅ Thread States (`Thread.State`)

- `NEW`
- `RUNNABLE`
- `BLOCKED`
- `WAITING`
- `TIMED_WAITING`
- `TERMINATED`

---

## ⭐ Most Commonly Used Methods
